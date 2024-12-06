package org.howard.edu.lsp.finalexam.question3;

/**
 * Renders shapes using the ShapeFactory.
 */
public class ShapeRenderer {
    public void renderShape(String shapeType) {
        try {
            Shape shape = ShapeFactory.getInstance().getShape(shapeType);
            shape.draw();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        ShapeRenderer renderer = new ShapeRenderer();

        // Render different shapes
        renderer.renderShape("circle");    // Output: Drawing a Circle
        renderer.renderShape("rectangle"); // Output: Drawing a Rectangle
        renderer.renderShape("triangle");  // Output: Drawing a Triangle
        renderer.renderShape("hexagon");   // Output: Unknown shape type: hexagon
    }
}

