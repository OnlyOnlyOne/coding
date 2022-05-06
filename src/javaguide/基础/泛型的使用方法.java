package javaguide.基础;

import java.util.HashMap;
import java.util.Map;

public class 泛型的使用方法 {
    public static void main(String[] args) {
        Generic<Integer> g = new Generic<Integer>(12345);
        System.out.println(g.getKey());

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    }

    //泛型接口
    interface Generatoc<T> {
        T method();
    }

    static class Generic<T> {
        private T key;

        public Generic(T key) {
            this.key = key;
        }

        public Generic() {
        }

        public T getKey() {
            return key;
        }

        public void setKey(T key) {
            this.key = key;
        }
    }

    class GeneratorImpl<T> implements Generatoc<T> {
        @Override
        public T method() {
            return null;
        }
    }
}

