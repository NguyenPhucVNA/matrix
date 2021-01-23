package com;

public class UserUi extends Operations {
    //little menu
    private void menu() {
        System.out.println("1. Add matrices ");
        System.out.println("2. Multiply matrix by a constant ");
        System.out.println("3. Multiply matrices ");
        System.out.println("4. Transpose matrix ");
        System.out.println("0. Exit ");
        System.out.print("Your choice:");
    }

    private void menu2() {
        System.out.println("1. Main diagonal ");
        System.out.println("2. Side diagonal ");
        System.out.println("3. Vertical line ");
        System.out.println("4. Horizontal line ");
        System.out.print("Your choice:");
    }

    //Let the user choose
    public void fire() {
        boolean run = true;
        while (run) {
            menu();
            switch (scanner.nextInt()) {
                case 1:
                    addition();
                    break;
                case 2:
                    multiplyByConstant();
                    break;
                case 3:
                    multiplyMatrices();
                    break;
                case 4:
                    transpose();
                    return;
                case 0:
                    run = false;
                    break;
            }
        }
    }

    public void transpose() {
        menu2();
        switch (scanner.nextInt()) {
            case 1:
                mainTranspose();
                break;
            case 2:
                sideTranspose();
                break;
            case 3:
                verticalTranspose();
                break;
            case 4:
                horizontalTranspose();
                break;

        }
    }
}
