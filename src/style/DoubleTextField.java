/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package style;

import javafx.scene.control.TextField;
/**
 *
 * @author Oktay
 */
public class DoubleTextField extends TextField{

    
int i=0;
    @Override
    public void replaceText(int start, int end, String text) {
        if (text.matches("[0-9-]") || text.matches("[.]") || text.isEmpty() ) {
            if (start == 5) {
                text="";
            }
            super.replaceText(start, end, text);
        }
    }

    @Override
    public void replaceSelection(String replacement) {
        super.replaceSelection(replacement); //To change body of generated methods, choose Tools | Templates.
    }
}

