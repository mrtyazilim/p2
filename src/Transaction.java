import java.time.LocalDate;

public class Transaction {
    /*
    description (boş olabilir)
    transactionDate (tarih ve saat - istenilen biçimde tutulabilir)
    amount
    */
    String[] description={"avans çekildi","malzeme alındı"};
    LocalDate transactionDate = LocalDate.now();
    Long amount;

}
