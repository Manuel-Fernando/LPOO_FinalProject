package Gui;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;

public class MyListCellRenderer extends DefaultListCellRenderer{
	
	private ArrayList <Integer> indexesToHighlight = new ArrayList <Integer>();
	
	public void addIndex(int index){
		indexesToHighlight.add(index);
	}
	
	public void removeInxex(int index){		
		
		if (!indexesToHighlight.isEmpty()) {
			
			for (int j=0;j<indexesToHighlight.size();j++){
				
				if (indexesToHighlight.get(j)==index){
					indexesToHighlight.remove(j);
				}
			}
			
		}
	}
	
	@Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {

        JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        label.setOpaque(isSelected);
        label.setOpaque(true); 
        
        for (int i=0;i<indexesToHighlight.size();i++){
        	
        	if(index == indexesToHighlight.get(i)) {
                label.setBackground(new Color(8, 83, 148));
                label.setEnabled(false);     
            }
        	
        }
        
        
        return label;
    }

}
