/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jme3.gde.cinematic.gui;

import com.jme3.gde.cinematic.core.Layer;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.nodes.Sheet;
import org.openide.util.Lookup;

/**
 * The Node representation of a Layer. This class and acts as a bridge b/w
 * javafx/dataStructure/Netbeans PropertySheet and Explorer Api
 *
 * @author MAYANK
 */
public class CinematicLayerNode extends AbstractNode{
    Layer layer;
    
    public CinematicLayerNode(Layer layer){
        super(Children.create(new CinematicChildFactory(layer),true));
        this.layer = layer;
        setDisplayName(layer.getName());
    }
    public CinematicLayerNode(Children children,Lookup lookup) {
        super(children,lookup);
        
    }

    @Override
    protected Sheet createSheet() {
        System.out.println("Fetching Property sheet");
        return layer.createSheet(); 
    }

    
    
}
