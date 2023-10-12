package ForLearning;

// 产品接口
interface Product {
    void doSomething();
}

// 具体产品
class ConcreteProductA implements Product {
    @Override
    public void doSomething() {
        System.out.println("在产品A中做一些事情。");
    }
}

class ConcreteProductB implements Product {
    @Override
    public void doSomething() {
        System.out.println("在产品B中做一些事情。");
    }
}

// 工厂类
class ProductFactory {
    public Product createProduct(String type) {
        if (type.equals("A")) {
            return new ConcreteProductA();
        } else if (type.equals("B")) {
            return new ConcreteProductB();
        }

        throw new IllegalArgumentException("无效的产品类型。");
    }
}

// 使用示例
public class Main {
    public static void main(String[] args) {
        ProductFactory factory = new ProductFactory();

        // 使用工厂创建产品
        Product productA = factory.createProduct("A");
        Product productB = factory.createProduct("B");

        // 调用产品的方法
        productA.doSomething();
        productB.doSomething();
    }
}