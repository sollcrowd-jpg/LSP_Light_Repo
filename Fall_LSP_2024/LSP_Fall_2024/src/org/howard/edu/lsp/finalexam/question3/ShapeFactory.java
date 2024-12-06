package org.howard.edu.lsp.finalexam.question3;

/**
 * Singleton Factory for creating Shape objects.
 */
public class ShapeFactory {
    private static ShapeFactory instance;

    // Private constructor to prevent instantiation
    private ShapeFactory() {}

    /**
     * Gets the singleton instance of ShapeFactory.
     * 
     * @return the singleton instance
     */
    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    /**
     * Creates a Shape object based on the provided shapeType.
     * 
     * @param shapeType the type of shape to create
     * @return the Shape object
     */
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("triangle")) {
            return new Triangle();
        } else {
            throw new IllegalArgumentException("Unknown shape type: " + shapeType);
        }
    }
}

