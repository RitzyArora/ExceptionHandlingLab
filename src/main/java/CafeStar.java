public class CafeStar {
    private double amount;
    private int quantity;
    private double cgst;
    private double sgst;
    private double totalAmount;

    public double getAmount() {
            return this.amount;
        }


    public void setAmount(double amount) throws IllegalArgumentException {
        if (amount > 0) {

            this.amount = amount;
        }
        else
            throw new IllegalArgumentException("Invalid Amount");

    }
    public int getQuantity(){
            return this.quantity;
        }


    public void setQuantity(int quantity) throws IllegalArgumentException
    {
        if(quantity>0)
        this.quantity = quantity;
        else
            throw new IllegalArgumentException("Invalid Quantity");
    }

    public double getCgst() {
        return cgst;
    }

    public void setCgst(double cgst) {
        this.cgst = cgst;
    }

    public double getSgst() {
        return sgst;
    }

    public void setSgst(double sgst) {
        this.sgst = sgst;
    }

    public double calculateAmount()
    {
        totalAmount=(quantity*amount)+((cgst*amount)/100)+((sgst*amount)/100);
        return totalAmount;
    }
}


