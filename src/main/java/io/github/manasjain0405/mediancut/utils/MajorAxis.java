package io.github.manasjain0405.mediancut.utils;

import io.github.manasjain0405.mediancut.model.Pixel;
import io.github.manasjain0405.mediancut.utils.comparators.BlueComparator;
import io.github.manasjain0405.mediancut.utils.comparators.GreenComparator;
import io.github.manasjain0405.mediancut.utils.comparators.RedComparator;

import java.util.Comparator;

public enum MajorAxis {
    RED{
        @Override
        Comparator<Pixel> getComparator() {
            return new RedComparator();
        }
    },
    BLUE{
        @Override
        Comparator<Pixel> getComparator() {
            return new BlueComparator();
        }
    },
    GREEN{
        @Override
        Comparator<Pixel> getComparator() {
            return new GreenComparator();
        }
    };

    abstract Comparator<Pixel> getComparator();



}
