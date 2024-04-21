package model;

public class Donor {

    private int idDonor;
    private String nmDonor;
    private String cpf;
    private String phone;

    public Donor(int idDonor, String nmDonor, String cpf, String phone) {
        this.setIdDonor(idDonor);
        this.setNmDonor(nmDonor);
        this.setCpf(cpf);
        this.setPhone(phone);
    }

    public int getIdDonor() {
        return idDonor;
    }

    public void setIdDonor(int idDonor) {
        if (idDonor <= 0) {
            throw new RuntimeException("Id can't be less than 1");
        }
        this.idDonor = idDonor;
    }

    public String getNmDonor() {
        return nmDonor;
    }

    public void setNmDonor(String nmDonor) {
        if(nmDonor.length() > 45) {
            throw new RuntimeException("Name length bigger than 45 chars");
        }
        this.nmDonor = nmDonor;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.length() !=  11) {
            throw new RuntimeException("CPF needs to be 11 chars");
        }
        this.cpf = cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if(phone.length() !=  11) {
            throw new RuntimeException("Phone number needs to be 11 chars");
        }
        this.phone = phone;
    }
}
