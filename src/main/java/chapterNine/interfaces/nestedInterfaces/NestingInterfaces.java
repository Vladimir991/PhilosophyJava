package chapterNine.interfaces.nestedInterfaces;

/**
 * Created by Vladimir Glinskikh on 18.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class NestingInterfaces {
    public static class BImp implements A.B {

        @Override
        public void f() {

        }

        class CImp implements A.C {

            @Override
            public void f() {

            }
        }

        class EGImp implements E.G {

            @Override
            public void f() {

            }
        }

        class EImp2 implements E {

            @Override
            public void g() {

            }
        }

        class EG implements E.G {

            @Override
            public void f() {

            }
        }

        public static void main(String[] args) {
            A a2 = new A();
            a2.receiveD(a2.getD());
        }
    }
}
