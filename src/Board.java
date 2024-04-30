/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Xander
 */

import javax.swing.JFrame;
public class Board {
    
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    
    public static void main(String[] args) {
        
        final JFrame frame = new JFrame("Snake Game");
        snakeGame game = new snakeGame(WIDTH, HEIGHT);
        frame.add(game);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.pack();
        
        
        game.startGame();
    }
}
