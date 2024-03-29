
        public class MatrisTranspozu {
            public static void main(String[] args) {
                // Örnek matrisi tanımlayalım
                int[][] matris = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

                System.out.println("Orjinal Matris:");
                matrisiYazdir(matris);

                int[][] transpozeMatris = transpozunuBul(matris);

                System.out.println("Transpoze Matris:");
                matrisiYazdir(transpozeMatris);
            }

            public static int[][] transpozunuBul(int[][] matris) {
                int satirSayisi = matris.length;
                int sutunSayisi = matris[0].length;

                int[][] transpozeMatris = new int[sutunSayisi][satirSayisi];

                for (int i = 0; i < satirSayisi; i++) {
                    for (int j = 0; j < sutunSayisi; j++) {
                        transpozeMatris[j][i] = matris[i][j];
                    }
                }

                return transpozeMatris;
            }

            public static void matrisiYazdir(int[][] matris) {
                for (int i = 0; i < matris.length; i++) {
                    for (int j = 0; j < matris[0].length; j++) {
                        System.out.print(matris[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
