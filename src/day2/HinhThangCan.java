package day2;

    public class HinhThangCan {
        private double dayNho;
        private double dayLon;
        private double duongCheo1;
        private double duongCheo2;

        public HinhThangCan(double dayNho, double dayLon, double duongCheo1, double duongCheo2) {
            if (dayNho <= 0 || dayLon <= 0 || duongCheo1 <= 0 || duongCheo2 <= 0) {
                throw new RuntimeException("Gia tri nhap vao khong hop le");
            }
            this.dayNho = dayNho;
            this.dayLon = dayLon;
            this.duongCheo1 = duongCheo1;
            this.duongCheo2 = duongCheo2;
        }

        public double tinhChuVi() {
            double canhB = (dayLon - dayNho) / 2;
            double canhA = Math.sqrt(Math.pow(canhB, 2) + Math.pow(duongCheo1 / 2, 2));
            double chuVi = 2 * (canhA + canhB) + dayNho + dayLon;
            return chuVi;
        }

        public double tinhDienTich() {
            double chieuCao = (duongCheo1 + duongCheo2) / 2;
            double dienTich = (dayNho + dayLon) * chieuCao / 2;
            return dienTich;
        }
    }


