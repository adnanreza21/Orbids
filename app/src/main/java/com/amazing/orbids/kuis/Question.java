package com.amazing.orbids.kuis;

public class Question {

    public String mQuestions[] = {
            "1. Perhatikan gambar berikut !\n" +
                    " Tanaman manakah termasuk dalam Familia Orchidaceae ?",
            "2. Salah satu faktor yang dapat mempengaruhi keanekaragaman Anggrek di Kawasan Yogyakarta adalah suhu, kelembapan udara, dan intensitas cahaya. Faktor ini dinamakan sebagai ...",
            "3. Menurut habitat tempat hidupnya, tanaman anggrek dibedakan menjadi empat kelompok, kecuali ...",
            "4. Perhatikan gambar berikut !\n" +
                    "Keanekaragaman yang terjadi pada anggrek-anggrek diatas disebabkan karena ...",
            "5. Perhatiakan pernyataan berikut ini !\n" +
                    "1) Terjadi dalam satu spesies anggrek yang sama.\n" +
                    "2) Terjadi pada anggrek yang berbeda spesies.\n" +
                    "3) Variasi terjadi karena perbedaan susunan gen yang berbeda\n" +
                    "4) Variasi terjadi karena perbedaan morfologi.\n" +
                    "5) Spathoglottis plicata bunga putih, putih keunguan, dan ungu.\n" +
                    "6) Dendrobium anosmum, Vanda tricolor, dan Phalaenopsis amabilis.\n" +
                    "Pernyataan yang tepat mengenai keanekaragaman tingkat gen ditunjukkan oleh nomor ...\n",
            "6. Salah satu penyebab adanya keanekaragaman genetik pada anggrek adalah, kecuali....",
            "7. Seorang siswa melakukan observasi di bukit Turgo menjumpai suatu anggrek dengan ciri-ciri sebagai berikut:\n" +
                    "1) Habitatnya menempel pada pohon akasia\n" +
                    "2) Memiliki pseudobulb yang terlihat jelas berwarna hijau\n" +
                    "3) Daun dan bunga keluar dari ujung batang\n" +
                    "4) Memiliki bunga yang unik dengan lebelum yang menyerupai bibir dan berbulu dengan motif corak kemerahan.\n" +
                    "Dari keempat ciri-ciri diatas dapat diidentifikasi bahwa nama dari tumbuhan tersebut adalah ...\n",
            "8. Perhatikan gambar berikut !\n" +
                    "Dilihat dari arah pertumbuhannya Spathoglotis plicata tersebut memiliki tipe batang ?",
            "9. Perhatikan gambar berikut !\n" +
                    "Kedua gambar diatas menunjukan adanya keanekaragaman tingkat ...",
            "10. Perhatikan gambar berikut !\n" +
                    "Dari gambar bunga diatas manakah bagian yang disebut dengan labellum/bibir bunga  ...",

    };

    private String mChoices[][] = {

            {"a. (2), (3), (4)", "b. (1), (3), (4)", "c. (1), (2), (4)", "d. (2), (3)", "e. (1), (2), (3)"},
            {"a. Faktor edafik", "b. Faktor genetik ", "c. Faktor klimatik", "d. Faktor topografik", "e. Faktor alam"},
            {"a. Saprofit", "b. Epifit", "c. Litofit", "d. Terestial", "e. Aquatik"},
            {"a. Persamaan susunan gen dalam satu spesies ", "b. Perbedaan susunan gen dalam satu spesies", "c. Perbedaan spesies dari kedua anggrek tersebut", "d. Perbedaan komunitas", "e. Perbedaan ekosistem"},
            {"a. 1, 4, dan 6", "b. 1, 3, dan 5", "c. 1, 4, dan 5", "d. 2, 3, dan 6", "e. 2, 4, dan 6"},

            {"a. Mutasi", "b. Lingkungan", "c. Rekombinasi gen", "d. Adaptasi", "e. Bibit anggrek"},
            {"a. Vanda tricolor", "b. Dendrobium crumenatum", "c. Dendrobium anosmum", "d. Phalaenopsis amabilis", "e. Coeloegyn spesiosa"},
            {"a. Monopodial", "b. Duopodial", "c. Sympodial", "d. Bipodial", "e. Asympodial"},
            {"a. Ekosistem", "b. Gen", "c. Spesies", "d. Family", "e. Ordo"},
            {"a. SD", "b. P", "c. SL", "d. L", "e. C"},


    };
    private String mCorrectAnswer[] = {

            "c. (1), (2), (4)",
            "c. Faktor klimatik",
            "e. Aquatik",
            "b. Perbedaan susunan gen dalam satu spesies",
            "b. 1, 3, dan 5",

            "e. Bibit anggrek",
            "e. Coeloegyn spesiosa",
            "c. Sympodial",
            "c. Spesies",
            "d. L",

    };

    public int getLength() {
        return mQuestions.length;
    }

    public String getQuestions(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a) {
        String choice = mChoices[a][3];
        return choice;
    }

    public String getChoice5(int a) {
        String choice = mChoices[a][4];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswer[a];
        return answer;
    }
}
