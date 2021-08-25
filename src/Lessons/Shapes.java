package Lessons;

public abstract class Shapes {
    public abstract String getName();

}


class Circle extends Shapes {
    private static final String Name = "Circle";


    @Override
    public String getName() {
        return Name;
    }
}

class Rect extends Shapes {
    private static final String Name = "Rect";

    @Override
    public String getName() {
        return Name;
    }
}

class Triangle extends Shapes {
    private static final String Name = "Triangle";

    @Override
    public String getName() {
        return Name;
    }
}

class Square extends Shapes {
    private static final String Name = "Square";

    @Override
    public String getName() {
        return Name;
    }
}