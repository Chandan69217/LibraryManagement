package components;

import javax.swing.JComboBox;


public class Custom_Combo_Box<e> extends JComboBox {

    public Custom_Combo_Box() {
        setUI(new ComboSuggestionUI());
        setOpaque(false);
    }
    
}
