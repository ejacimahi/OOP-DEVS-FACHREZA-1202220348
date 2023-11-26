import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accountList; // ArrayList untuk menyimpan akun-akun

    public Bank() {
        accountList = new ArrayList<>(); // Constructor inisialisasi ArrayList
    }

    public void addAccount(Account account) {
        accountList.add(account); // Method untuk menambahkan akun ke daftar
    }

    public void removeAccount(String accountNumber) {
        for (int i = 0; i < accountList.size(); i++) {
            Account account = accountList.get(i);
            if (account.getAccountNumber().equals(accountNumber)) {
                accountList.remove(i); // Method untuk menghapus akun dari daftar
                break;
            }
        }
    }

    public Account getAccount(String accountNumber) {
        for (Account account : accountList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account; // Method untuk mendapatkan objek akun berdasarkan nomor akun
            }
        }
        return null; // Mengembalikan null jika akun tidak ditemukan
    }

    public ArrayList<Account> getAllAccounts() {
        return accountList; // Method untuk mendapatkan semua akun dalam bank
    }
}
