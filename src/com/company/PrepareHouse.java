package com.company;
public abstract class PrepareHouse {

        // Template method is final so subclasses can't override
        public final void constructHouse() {
            construcFoundation();
            construcPillars();
            construcWalls();
            construcWindows();
            System.out.println("House is constructed.");
        }

        // Methods to be implemented by subclasses

        public abstract void construcFoundation();

        public abstract void construcPillars();

        public abstract void construcWalls();
        //this is an abstract function for windows

        public abstract void construcWindows();

    }



