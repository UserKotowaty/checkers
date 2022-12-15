package com.checkers.dubi.view;

import com.checkers.Main;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class pawnsDraw{
    public static void drawPawns(int a, int b, Pane root, int layers){
        for(int i=0;i<a;i++){
            for(int j=0; j<b;j++){
                Pawn pawn = null;
                if(j < layers && (i+j)%2==1){
                    pawn=new Pawn(i,j,false,false);
                    root.getChildren().add(pawn);
                }
                if(j >= b-layers && (i+j)%2==1){
                    pawn=new Pawn(i,j,true,false);
                    root.getChildren().add(pawn);
                }

            }
        }
    }
}
