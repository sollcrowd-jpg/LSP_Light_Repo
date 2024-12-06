package org.howard.edu.lsp.finalexam.question3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for ShapeFactory and ShapeRenderer.
 */
public class ShapeRendererTest {

    @Test
    public void testCircleCreation() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape circle = factory.getShape("circle");
        assertTrue(circle instanceof Circle, "Shape should be an instance of Circle");
    }

    @Test
    public void testRectangleCreation() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape rectangle = factory.getShape("rectangle");
        assertTrue(rectangle instanceof Rectangle, "Shape should be an instance of Rectangle");
    }

    @Test
    public void testTriangleCreation() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape triangle = factory.getShape("triangle");
        assertTrue(triangle instanceof Triangle, "Shape should be an instance of Triangle");
    }

    @Test
    public void testUnknownShape() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            factory.getShape("hexagon");
        });
        assertEquals("Unknown shape type: hexagon", exception.getMessage());
    }
}
