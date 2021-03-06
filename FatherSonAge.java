class WrongAge extends Exception {
    public String toString() {
        return "Please enter the right age:";
    }
}

class Father {
    int age;

    Father(int age1) {
        age = age1;
        System.out.println("Father age:" + age);
    }
}

class Son extends Father {
    Son(int age1) {
        super(age1);
        System.out.println("Son age:" + age);
    }
}

class Set3 {
    public static void main(String args[])
        throws WrongAge {
        int i = args.length;
        int j = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        if (i <= 0 || j <= k) {
            throw new WrongAge();
        } else {
            Father f = new Father(j);
            Son s = new Son(k);

        }
    }
}