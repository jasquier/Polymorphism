package io.zipcoder.pets;

/**
 * @author John A. Squier
 * @author Michael Wolfe
 * A pet class that Michael Wolfe will implement.
 */
abstract public class Pet
{
    protected String name;

    public Pet() {}

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return "My name is: " + getName() + ".  I say \"" + speak() + "\"";
    }

    abstract public String speak();
}
