package org.example.probematura.repository;


import org.example.probematura.domain.Article;
import org.example.probematura.domain.InvoiceItem;
import org.example.probematura.help.ArticlePurchaseView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface InvoiceItemRepository extends JpaRepository<InvoiceItem, Integer> {
    List<ArticlePurchaseView> findDistinctArticleByInvoiceDateBetween(LocalDateTime a, LocalDateTime b);
}
