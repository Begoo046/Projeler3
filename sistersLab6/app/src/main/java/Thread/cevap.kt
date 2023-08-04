package Thread

fun main() {
    println("Ana thread başladı.")

    // İlk thread oluşturup 5 saniye uyutuyoruz.
    val thread1 = Thread {
        Thread.sleep(5000)
        println("Thread 1: Uyandım!")
    }

    // İkinci thread oluşturup 3 saniye uyutuyoruz.
    val thread2 = Thread {
        Thread.sleep(3000)
        println("Thread 2: Uyandım!")
    }

    // Threadleri başlatıyoruz.
    thread1.start()
    thread2.start()

    // Ana thread'in 6 saniye uyumasını sağlıyoruz.
    Thread.sleep(6000)

    println("Ana thread bitti.")
}