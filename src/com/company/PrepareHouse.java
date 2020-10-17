package com.company;
public abstract class PrepareHouse {

        // Template method is final so subclasses can't override
        public final void constructHouse() {
            constructFoundation();
            constructPillars();
            constructWalls();
            constructWindows();
            System.out.println("House is constructed.");
        }

        // Methods to be implemented by subclasses

        public abstract void constructFoundation();

        public abstract void constructPillars();

        public abstract void constructWalls();

        public abstract void constructWindows();

    }



