package controller;

import com.sun.java.accessibility.util.AccessibilityListenerList;
import com.sun.xml.internal.ws.client.ResponseContext;
import model.entity.Pedido;
import service.ClienteService;


public class Controller {
    ClienteService clienteService;

    //get-> produtos(prodA,prodB) -> pedido(1) -> ## cliente(Joao) ##
    public String pedidoClienteCompleto(Pedido pedido){

        Boolean a = clienteService.clienteEfetuaPedido(pedido);
        return a ? "200 - OK" : "400 - Erro";
    }
}
