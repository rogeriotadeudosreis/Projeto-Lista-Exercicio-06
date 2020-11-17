/*
 * 6. Escreva o método de inserção para uma lista ordenada implementada em
vetores. Seu método de inserção deverá utilizar um método de busca binária
para verificar se o elemento existe ou não. Caso o elemento não exista a sua
busca binária deverá retornar a posição onde o elemento deverá ser
inserido.
 */
package br.rogerio.app;

import br.rogerio.model.Lista;
import javax.swing.JOptionPane;

/**
 *
 * @author roger
 */
public class ListaApp {

    public static void main(String[] args) {

        Lista lista = new Lista(10);
        try {
            lista.insereInicio(9);
            lista.insereInicio(13);
            lista.insereInicio(27);
            lista.insereInicio(31);
            lista.insereInicio(47);
            lista.insereInicio(67);
            lista.insereInicio(71);
            
            lista.ordenarLista();
            lista.mostrarLista();

            lista.inserirComVerificacao(47);
            lista.mostrarLista();
//            lista.inserirComVerificacao(51);
//            lista.mostrarLista();
//            lista.inserirComVerificacao(51);

        } catch (RuntimeException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
       
    }

}
