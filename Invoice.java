class Invoice 
{
    private String partnumber,partdescription;
    private int quantity;
    private double price;
    Invoice(String pno,String pdes,int q,double p)
    {
        partnumber=pno;
        partdescription=pdes;
        quantity=q;
        price=p;
    }
    void setPartNum(String pno)
    {
        partnumber=pno;
    }
    void setPartDes(String pdes)
    {
        partdescription=pdes;
    }
    void setQuan(int q)
    {
        quantity=q;
    }
    void setPrice(double p)
    {
        price=p;
    }
    String getPartNum()
    {
        return partnumber;
    }
    String getPartDeS()
    {
        return partdescription;
    }
    int getQuan()
    {
        return quantity;
    }
    double getPrice()
    {
        return price;
    }
    double getInvoiceAmount()
    {
        if (quantity<0)
            quantity=0;
        if (price<0)
            price=0;
        return quantity*price;
    }
}


