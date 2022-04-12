package service;

import dao.ClienteDAO;
import model.entity.Carteira;
import model.entity.Cliente;
import model.entity.Pedido;

public class ClienteService {
    ClienteDAO clienteDAO;

    public Boolean clienteEfetuaPedido(Pedido pedido) {
        Cliente cliente = clienteDAO.buscaPorId(pedido.getClienteIdCliente());
        //TODO: Do request
        calculoResidual(cliente, pedido);
        return true;
    }

    private void calculoResidual(Cliente cliente, Pedido pedido) {
        cliente.getCarteiraCliente().setPontos(
                cliente.getCarteiraCliente().getPontos() + pedido.getValorUnidade() / 10);
        //TODO: Commit changes on database
    }

}
