package com.example.listviewicon_presiden_ri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview = findViewById<ListView>(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(Model("Ir. Soekarno", "Presiden RI ke 1 (1945 - 1968)", R.drawable.soekarno))
        list.add(Model("Soeharto", "Presiden RI ke 2 (1968 - 1968)", R.drawable.suharto))
        list.add(Model("B.J. Habibie", "Presiden RI ke 3 (1968 - 1999)", R.drawable.habibie))
        list.add(Model("Abdurrahman Wahid", "Presiden RI ke 4 (1999 - 2001)", R.drawable.gusdur))
        list.add(
            Model(
                "Megawati Soekarno Putri",
                "Presiden RI ke 5 (2001 - 2004)",
                R.drawable.megawati
            )
        )
        list.add(
            Model(
                "Susilo Bambang Yudhoyono",
                "Presiden RI ke 6 (2004 - 2014)",
                R.drawable.sby
            )
        )
        list.add(Model("Joko Widodo", "Presiden RI ke 7 (2014 - sekarang)", R.drawable.jokowi))


        listview.adapter = MyAdapter(this, R.layout.row, list)

        listview.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->
            if (position == 0) {
                Toast.makeText(
                    this@MainActivity,
                    "Presiden pertama Republik Indonesia, Soekarno yang biasa dipanggil Bung Karno, lahir di Blitar, Jawa Timur, \n" +
                            "6 Juni 1901 dan meninggal di Jakarta, 21 Juni 1970. hari Minggu, 21 Juni 1970 beliau meninggal dunia \n" +
                            "di RSPAD. Ia disemayamkan di Wisma Yaso, Jakarta dan dimakamkan di Blitar, Jatim di dekat makam ibundanya, Ida Ayu Nyoman \n" +
                            "Rai. Pemerintah menganugerahkannya sebagai “Pahlawan Proklamasi",
                    Toast.LENGTH_LONG
                ).show()
            }
            if (position == 1) {
                Toast.makeText(
                    this@MainActivity,
                    "Lahir di Kemusuk, Yogyakarta, tanggal 8 Juni 1921. Beliau terpilih menjadi prajurit teladan di \n" +
                            "Sekolah Bintara, Gombong, Jawa Tengah pada tahun 1941. Beliau resmi menjadi anggota TNI pada 5 Oktober 1945. Jenderal Besar yang oleh MPR dianugerahi penghormatan sebagai Bapak Pembangunan \n" +
                            "Nasional, beliau meninggal pada 27 Januari 2008 di Rumah Sakit \n" +
                            "Pusat Pertamina (RSPP), Jakarta.",
                    Toast.LENGTH_LONG
                ).show()
            }
            if (position == 2) {
                Toast.makeText(
                    this@MainActivity,
                    "Bacharuddin Jusuf Habibie lahir di Pare-Pare, Sulawesi Selatan, pada 25 Juni 1936. Beliau mendapat gelar \n" +
                            "Diploma dari Technische Hochschule, Jerman tahun 1960 yang kemudian mendapatkan gekar Doktor dari tempat yang sama tahun \n" +
                            "1965. Habibie menikah tahun 1962, dan dikaruniai dua orang anak. Tahun 1967, beliau menjadi Profesor kehormatan (Guru Besar) pada \n" +
                            "Institut Teknologi Bandung.BJ Habibie wafat di RSPAD, Rabu 11 September 2019 pukul 18.05 WIB",
                    Toast.LENGTH_LONG
                ).show()
            }
            if (position == 3) {
                Toast.makeText(
                    this@MainActivity,
                    "Gus Dur lahirkan di Denanyar Jombang Jawa Timur pada tanggal 4 Agustus 1940. Pada tahun 1984 Gus Dur dipilih secara aklamasi oleh sebuah tim ahl hall wa al-’aqdi yang diketuai \n" +
                            "K.H. As’ad Syamsul Arifin untuk menduduki jabatan ketua umum PBNU pada muktamar ke-27 di Situbondo. Jabatan tersebut kembali \n" +
                            "dikukuhkan pada muktamar ke-28 di pesantren Krapyak Yogyakarta (1989), dan muktamar di Cipasung Jawa Barat (1994). Beliau wafat \n" +
                            "pada tanggal  30 Desember 2009 pada pukul 18.45 WIB di Rumah Sakit Cipto Mangkusumo, Jakarta",
                    Toast.LENGTH_LONG
                ).show()
            }
            if (position == 4) {
                Toast.makeText(
                    this@MainActivity,
                    "Megawati Soekarnoputri lahir di Yogyakarta, 23 Januari 1947. Megawati adalah putri sulung dari Presiden RI pertama yang juga \n" +
                            "proklamator, Soekarno dan Fatmawati. Megawati menjadi presiden hingga 20 Oktober 2003. Setelah habis masa jabatannya, Megawati \n" +
                            "kembali mencalonkan diri sebagai presiden dalam pemilihan presiden langsung tahun 2004. Namun, beliau gagal untuk kembali menjadi \n" +
                            "presiden setelah kalah dari Susilo Bambang Yudhoyono yang akhirnya menjadi Presiden RI ke-6. ",
                    Toast.LENGTH_LONG
                ).show()
            }
            if (position == 4) {
                Toast.makeText(
                    this@MainActivity,
                    "SBY merupakan presiden pertama yang dipilih secara langsung oleh rakyat dalam proses Pemilu Presiden putaran II 20 September 2004. \n" +
                            "Lulusan terbaik AKABRI (1973) yang akrab disapa SBY ini lahir di Pacitan, Jawa Timur 9 September 1949. Karir politiknya dimulai tanggal 27 Januari 2000, \n" +
                            "dan dipercaya menjabat sebagai Menteri Pertambangan dan Energi pada pemerintahan Presiden KH Abdurrahman Wahid. Tak lama kemudian, \n" +
                            "pada 11 Maret 2004, beliau memilih mengundurkan diri dari jabatan Menko Polkam. Pada pemilu Presiden langsung putaran kedua 20 \n" +
                            "September 2004, Dan pada tanggal 20 Oktober 2004 beliau dilantik menjadi Presiden RI ke-6. ",
                    Toast.LENGTH_LONG
                ).show()
            }
            if (position == 4) {
                Toast.makeText(
                    this@MainActivity,
                    "Jokowi lahir di Surakarta, 21 Juni 1961. Ia merupakan Putera dari pasangan Noto Mihardjo dan Sudhiatmi dan anak sulung dari empat bersaudara.\n" +
                            "ia kemudian mencoba kuliah di perguruan tinggi, ia kemudian diterima di jurusan Kehutanan di Universitas Gajah Mada. PDI perjuangan dan Partai Gerindra resmi mengusungnya pada \n" +
                            "tahun 2012 sebagai Calon Gubernur DKI Jakarta berpasangan dengan Basuki Tjahaja Purnama .\n" +
                            "Kemudian pada bulan juli 2014, hasil perhitungan suara oleh KPU Indonesia menyatakan Jokowi-Jusuf Kalla sebagai pemenang pada \n" +
                            "Pemilihan Presiden tahun 2014 dengan mengalahkan lawannya pasangan \n" +
                            "Prabowo-Hatta Rajasa ",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}