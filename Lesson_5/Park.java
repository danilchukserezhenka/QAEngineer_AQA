/**
 * Создать класс Park с внутренним классом, с помощью объектов которого можно хранить
 * информацию об аттракционах, времени их работы и стоимости.
 **/
    public class Park {
        public String nazvanie;
        public String lokaciay;
        public Park (String nazvanie, String lokaciay) {
            this.nazvanie = nazvanie;
            this.lokaciay = lokaciay;
        }
        private class Atrakcion {
            String info;
            String vrem;
            int stoimost;
            public Atrakcion (String info, String vrem, int stoimost) {
                this.info = info;
                this.vrem = vrem;
                this.stoimost = stoimost;
            }
        }
        public void addAtrakcion () {
            Atrakcion atrakcion1 = new Atrakcion("Колобок", "10-18",500);
        }
}

