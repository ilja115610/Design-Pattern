package com.company.structural.Flyweight;

import java.awt.*;

public class Tree {
    public int x;
    public int y;
    private TreeType treeType;

    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    public void draw(Graphics graphics) {
        treeType.draw(graphics, x, y);
    }
}
