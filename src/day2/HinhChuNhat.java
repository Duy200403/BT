package day2;

public class HinhChuNhat {
    private float chieuDai = 1;
    private float chieuRong = 1;
    public HinhChuNhat (){}
    public HinhChuNhat(float chieuDai, float chieuRong){
            this.chieuDai = chieuDai;
            this.chieuRong = chieuRong;
        }
        public float chuVi(){
            return (chieuDai + chieuRong)*2;
        }
        public float dienTich(){
            return chieuRong * chieuDai;
        }
}
