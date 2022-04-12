package service;

import dao.ClienteDAO;
import model.entity.Carteira;
import model.entity.Pedido;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class ClienteTest {

    ClienteService clienteService;
    ClienteDAO clienteDAO;

    @Test
    void calculaPontosResidualCliente() {
        Pedido mockPedido = pedidoMock();
        clienteService.clienteEfetuaPedido(mockPedido);
        Assertions.assertTrue(
                clienteDAO.buscaPorId(mockPedido.getClienteIdCliente()).getCarteiraCliente().getSaldo() > 0
        );
    }

    private Pedido pedidoMock() {
        Pedido pedidoMock = new Pedido();
        pedidoMock.setClienteIdCliente(1L);
        pedidoMock.setIdPedido(1);
        pedidoMock.setValorUnidade((float) 123.45);
        pedidoMock.setData(new Date());
        return pedidoMock;
    }
}
