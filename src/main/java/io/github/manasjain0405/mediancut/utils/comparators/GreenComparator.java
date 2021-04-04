package io.github.manasjain0405.mediancut.utils.comparators;

import io.github.manasjain0405.mediancut.model.Pixel;

import java.util.Comparator;

public class GreenComparator implements Comparator<Pixel> {

    @Override
    public int compare(Pixel o1, Pixel o2) {
        return (int) (o1.getG() - o2.getG());
    }
}
