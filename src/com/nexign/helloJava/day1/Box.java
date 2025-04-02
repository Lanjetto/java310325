package com.nexign.helloJava.day1;

import java.util.Arrays;
import java.util.Objects;

public class Box {
    private double volume;
    private float weight;
    // ALT + Insert = generator

    public Box(double volume, float weight) {
        this.volume = volume;
        this.weight = weight;
    }

    public static Box[] removeElement(Box[] boxes, int number) {
        if (number > boxes.length || number < 0) {
            throw new ArrayIndexOutOfBoundsException("Индекс не может быть такой");
        }
        Box temp = boxes[number];
        boxes[number] = boxes[boxes.length - 1];
        boxes[boxes.length - 1] = temp;

        // Копируем массив без последнего элемента
        return Arrays.copyOf(boxes, boxes.length - 1);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return Double.compare(volume, box.volume) == 0 && Float.compare(weight, box.weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume, weight);
    }
}
