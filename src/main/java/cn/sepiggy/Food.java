package cn.sepiggy;

// 使用接口组织枚举
public interface Food {
    enum Coffee implements Food {
        BLACK_COFFEE("black_coffee", 100, "BJ"),
        DECAF_COFFEE("decaf_coffee", 90, "TJ"),
        LATTE("latte", 80, "HB"),
        CAPPUCCINO("cappuccino", 70, "HN");

        // 成员变量
        private String name;
        private int price;
        private String location;

        // 构造方法
        private Coffee(String name, int price, String location) {
            this.name = name;
            this.price = price;
            this.location = location;
        }

        // 实现接口
        public String getName() {
            return name;
        }
    }

    enum Dessert implements Food {
        FRUIT("fruit", 10.0f),
        CAKE("cake", 9.8f),
        GELATO("gelato", 9.2f);

        // 成员变量
        private String name;
        private float rate;

        // 构造方法
        private Dessert(String name, float rate) {
            this.name = name;
            this.rate = rate;
        }

        // 实现接口
        public String getName() {
            return name;
        }
    }

    String getName();

}
