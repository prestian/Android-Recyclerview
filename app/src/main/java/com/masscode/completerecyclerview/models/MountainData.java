package com.masscode.completerecyclerview.models;

import java.util.ArrayList;

public class MountainData {

    // array to store data that will be displayed on RecyclerView
    public static String[][] data = new String[][] {
            // copy from my gits, link in description
            // this data from wikipedia
            {"Gunung Mount Everest",
                    "Gunung tertingi ke-1 (8,848 m (29,029 kaki))",
                    "https://upload.wikimedia.org/wikipedia/commons/f/f6/Everest_kalapatthar.jpg",
                    "Puncak Everest pertama yang diketahui terjadi pada tahun 1953, dan minat oleh pendaki meningkat. Terlepas dari upaya dan perhatian yang dicurahkan ke dalam ekspedisi, hanya sekitar 200 orang telah menyimpulkan pada tahun 1987. Everest tetap menjadi pendakian yang sulit selama beberapa dekade, bahkan untuk upaya serius oleh pendaki profesional dan ekspedisi nasional besar, yang merupakan norma sampai era komersial dimulai pada 1990-an. . Pada Maret 2012, Everest telah naik 5.656 kali dengan 223 kematian. Meskipun pegunungan yang lebih rendah memiliki pendakian yang lebih panjang atau lebih curam, Everest sangat tinggi sehingga aliran jet bisa menghantamnya. Pendaki dapat dihadapkan dengan angin melebihi 320 km / jam (200 mph) ketika cuaca berubah. Pada waktu-waktu tertentu dalam setahun aliran jet bergeser ke utara, memberikan periode yang relatif tenang di gunung. Bahaya lain termasuk badai salju dan longsoran salju.",
                    "Nepal dan China"},
            {"Gunung K2",
                    "Gunung tertingi ke-2 (8,611 m (28,251 kaki))",
                    "https://upload.wikimedia.org/wikipedia/commons/1/12/K2_2006b.jpg",
                    "K2, juga dikenal sebagai Gunung Godwin-Austen atau Chhogori, pada 8.611 meter (28.251 kaki) di atas permukaan laut, adalah gunung tertinggi kedua di dunia, setelah Gunung Everest pada 8.848 meter (29.029 kaki). Itu terletak di perbatasan Cina-Pakistan antara Baltistan di wilayah Gilgit-Baltistan di utara Pakistan, dan Kabupaten Otonomi Taxkorgan Tajik di Xinjiang, Cina. K2 adalah titik tertinggi dari rentang Karakoram dan titik tertinggi di Pakistan dan Xinjiang.",
                    "Pakistan"},
            {"Gunung Kangchenjunga",
                    "Gunung tertingi ke-3 8,586 m (28,169 kaki)",
                    "https://upload.wikimedia.org/wikipedia/commons/1/19/Kanchenjunga_from_Tiger_Hills.JPG",
                    "Kangchenjunga, juga dieja Kanchenjunga, adalah gunung tertinggi ketiga di dunia. Ia naik dengan ketinggian 8.586 m (28.169 kaki) di bagian Himalaya yang disebut Kangchenjunga Himal dibatasi di barat oleh Sungai Tamur, di utara oleh Lhonak Chu dan Jongsang La, dan di timur oleh Sungai Teesta. Itu terletak di antara Nepal dan Sikkim, India, dengan tiga dari lima puncak (Utama, Tengah, dan Selatan) langsung di perbatasan, dan dua lainnya (Barat dan Kangbachen) di Distrik Taplejung Nepal.",
                    "Nepal dan India"},
            {"Gunung Lhotse",
                    "Gunung tertingi ke-4 8,516 m (27,940 kaki)",
                    "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2018/09/010109090101/gunung-pemula-8-1024x767.jpg",
                    "Lhotse adalah gunung tertinggi keempat di dunia dengan 8.516 meter (27.940 kaki), setelah Gunung Everest, K2, dan Kangchenjunga. Bagian dari massif Everest, Lhotse terhubung ke puncak yang terakhir melalui Kol Selatan. Lhotse berarti \"Puncak Selatan\" dalam bahasa Tibet. Selain puncak utama di 8.516 meter (27.940 kaki) di atas permukaan laut, gunung ini terdiri dari puncak yang lebih kecil Lhotse Tengah (Timur) pada 8.414 m (27.605 kaki), dan Lhotse Shar pada 8.383 m (27.503 kaki). KTT itu berada di perbatasan antara Tibet di Tiongkok dan wilayah Khumbu di Nepal.",
                    "Nepal dan China"},
            {"Gunung Makalu",
                    "Gunung tertingi ke-5 8,463 m (27,766 kaki)",
                    "https://upload.wikimedia.org/wikipedia/commons/1/19/Makalu.jpg",
                    "\n" +
                            "Makalu adalah gunung tertinggi kelima di dunia pada 8.485 meter (27.838 kaki). Terletak di Himalaya Mahalangur, 19 km (12 mil) tenggara Gunung Everest, di perbatasan antara Nepal dan Daerah Otonomi Tibet, Cina. Salah satu dari delapan ribu, Makalu adalah puncak terisolasi yang bentuknya piramida empat sisi.",
                    "Nepal dan China"},
            {"Gunung Cho Oyu",
                    "Gunung tertingi ke-6 8,188 m (26,864 kaki)",
                    "https://upload.wikimedia.org/wikipedia/commons/1/1c/ChoOyu-fromGokyo.jpg",
                    "Cho Oyu adalah gunung tertinggi keenam di dunia dengan ketinggian 8.188 meter (26.864 kaki) di atas permukaan laut. Cho Oyu berarti \"Dewi Turquoise\" dalam bahasa Tibet. Gunung ini adalah puncak utama paling barat dari sub-bagian Khumbu di Mahalangur Himalaya, 20 km di sebelah barat Gunung Everest. Gunung itu berdiri di perbatasan Cina-Nepal. Hanya beberapa kilometer di sebelah barat Cho Oyu adalah Nangpa La (5.716 m / 18.753 kaki), sebuah jalan sempit yang berfungsi sebagai jalur perdagangan utama antara orang-orang Tibet dan para Sherpa Khumbu. Pass ini memisahkan Khumbu dan Rolwaling Himalaya. Karena kedekatannya dengan lintasan ini dan lereng umumnya moderat dari rute punggung barat laut standar, Cho Oyu dianggap sebagai puncak termudah 8.000 meter untuk didaki. Ini adalah tujuan populer untuk pesta yang dipandu secara profesional.",
                    "Nepal and China"},
            {"Gunung Dhaulagiri",
                    "Gunung tertingi ke-7 8,167 m (26,795 kaki)",
                    "https://upload.wikimedia.org/wikipedia/commons/5/5c/Dhaulagiri_mountain.jpg",
                    "Massa Dhaulagiri di Nepal memanjang 120 km (70 mil) dari Sungai Kaligandaki barat ke Bheri. Massif ini dibatasi di utara dan barat daya oleh anak-anak sungai Bheri dan di tenggara oleh Myagdi Khola. Dhaulagiri I adalah gunung tertinggi ketujuh di dunia dengan ketinggian 8.167 meter (26.795 kaki) di atas permukaan laut, dan gunung tertinggi di dalam perbatasan satu negara (Nepal). Ini pertama kali dinaiki pada 13 Mei 1960 oleh ekspedisi Swiss / Austria / Nepal.",
                    "Nepal"},
            {"Gunung Manaslu",
                    "Gunung tertingi ke-8 8,163 m (26,781 kaki)",
                    "https://upload.wikimedia.org/wikipedia/commons/e/e0/Sunrise%2C_Manaslu.jpg",
                    "Manaslu adalah gunung tertinggi kedelapan di dunia dengan ketinggian 8.163 meter (26.781 kaki) di atas permukaan laut. Terletak di Himalaya Mansiri, bagian dari Himalaya Nepal, di bagian barat-tengah Nepal. Namanya, yang berarti \"gunung roh\", berasal dari kata Sansekerta manasa, yang berarti \"kecerdasan\" atau \"jiwa\". Manaslu pertama kali naik pada 9 Mei 1956 oleh Toshio Imanishi dan Gyalzen Norbu, anggota ekspedisi Jepang. Dikatakan bahwa \"sama seperti orang Inggris menganggap Everest gunung mereka, Manaslu selalu menjadi gunung Jepang\".",
                    "Nepal"},
            {"Gunung Nanga Parbat",
                    "Gunung tertingi ke-9 8,126 m (26,660 kaki)",
                    "https://upload.wikimedia.org/wikipedia/commons/3/35/Fairy_Meadows_and_the_view_of_Nanga_Parbat.jpg",
                    "Nanga Parbat adalah gunung tertinggi kesembilan di dunia dengan ketinggian 8.126 meter (26.660 kaki) di atas permukaan laut. Terletak di Distrik Diamer di wilayah Gilgit Baltistan Pakistan, Nanga Parbat adalah jangkar barat Himalaya. Nama Nanga Parbat berasal dari kata Sansekerta nagna dan parvata yang bersama-sama berarti \"Gunung Telanjang\". Gunung ini secara lokal dikenal dengan nama Tibet Diamer atau Deo Mir, yang berarti \"gunung besar\".",
                    "Pakistan"},
            {"Gunung Annapurna",
                    "Gunung tertingi ke-10 (8,091 m (26,545 kaki))",
                    "https://upload.wikimedia.org/wikipedia/commons/f/f2/South_Face_of_Annapurna_I_%28Main%29.jpg",
                    "Annapurna adalah massa di Himalaya di utara-tengah Nepal yang mencakup satu puncak lebih dari 8.000 meter (26.000 kaki), tiga belas puncak lebih dari 7.000 meter (23.000 kaki), dan enam belas lebih lebih dari 6.000 meter (20.000 kaki). Massif memiliki panjang 55 kilometer (34 mil), dan dibatasi oleh Ngarai Kali Gandaki di barat, Sungai Marshyangdi di utara dan timur, dan Lembah Pokhara di selatan. Di ujung barat massif membungkus sebuah baskom tinggi yang disebut Suaka Annapurna. Annapurna I Main adalah gunung tertinggi kesepuluh di dunia pada 8.091 meter (26.545 kaki) di atas permukaan laut, dan pada tahun 1950 Maurice Herzog memimpin ekspedisi Prancis ke puncaknya, menjadikannya yang pertama dari delapan ribu yang harus didaki.",
                    "Nepal"}
    };

    public static ArrayList<Mountain> getListData() {
        Mountain mountain;
        ArrayList<Mountain> list = new ArrayList<>();

        for (String[] mData : data) {
            mountain = new Mountain();
            mountain.setName(mData[0]);
            mountain.setElevation(mData[1]);
            mountain.setPhoto(mData[2]);
            mountain.setDescription(mData[3]);
            mountain.setLocation(mData[4]);

            list.add(mountain);
        }

        return list;
    }

}
