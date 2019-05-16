package com.codenjoy.dojo.battlecity.model;

import com.codenjoy.dojo.services.Direction;
import com.codenjoy.dojo.services.Point;

import java.util.Objects;

public class Path {
    private Path parent;
    private Point point;
    private Direction direction;

    public Point getPoint() {
        return point;
    }
    public Path getParent() {
        return parent;
    }

    public Direction getDirection() {
        return direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Path path = (Path) o;
        return Objects.equals(point, path.point);
    }

    @Override
    public String toString() {
        return parent + " " + direction + " " + point;
    }

    @Override
    public int hashCode() {
        return Objects.hash(point);
    }

    public Path(Point point, Path parent, Direction direction) {
        this.point = point;
        this.parent = parent;
        this.direction = direction;
    }
}
