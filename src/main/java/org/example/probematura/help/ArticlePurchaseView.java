package org.example.probematura.help;

import java.time.LocalDateTime;

public interface ArticlePurchaseView {
    Integer       getArticleNumber();
    String        getArticleName();
    LocalDateTime getInvoiceDate();
    String        getInvoiceCustomerFirstName();
    String        getInvoiceCustomerLastName();
}

