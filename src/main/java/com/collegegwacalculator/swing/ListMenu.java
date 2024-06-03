/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.collegegwacalculator.swing;

import com.collegegwacalculator.model.Model_Menu;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class ListMenu<E extends Object> extends JList<E> {

    private final DefaultListModel model;
    public ListMenu() {
        model = new DefaultListModel();
        setModel(model);
    }


    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object o, int i, boolean bln, boolean blnl) {
                Model_Menu data;
                if (o instanceof Model_Menu){
                    data = (Model_Menu)o;
                }else {
                    data = new Model_Menu("",o+"",Model_Menu.MenuType.MENU);
                }
                MenuItem item = new MenuItem(data);
                return item;
            }
            
        };
    }  
    public void addItem (Model_Menu data){
        model.addElement(data);
    }
}
