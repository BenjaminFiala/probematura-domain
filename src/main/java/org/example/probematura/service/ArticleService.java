package org.example.probematura.service;

import org.example.probematura.domain.Article;
import org.example.probematura.domain.InvoiceItem;
import org.example.probematura.dto.DistinctArticleDto;
import org.example.probematura.help.ArticlePurchaseView;
import org.example.probematura.repository.InvoiceItemRepository;
import org.hibernate.sql.ast.tree.expression.Distinct;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {
    InvoiceItemRepository invoiceItemRepository;

    public ArticleService(InvoiceItemRepository invoiceItemRepository) {
        this.invoiceItemRepository = invoiceItemRepository;
    }
    public DistinctArticleDto toDistinctArticleDto(ArticlePurchaseView v) {
        return new DistinctArticleDto(v.getArticleNumber(),v.getArticleName(),v.getInvoiceDate(),v.getInvoiceCustomerFirstName(),v.getInvoiceCustomerLastName());
    }

    public List<DistinctArticleDto> findArticlesInPeriod(LocalDateTime start, LocalDateTime end) {
        List<ArticlePurchaseView>articles=invoiceItemRepository.findDistinctArticleByInvoiceDateBetween(start,end);
        List<DistinctArticleDto>dtos=new ArrayList<>();
        for(ArticlePurchaseView article:articles){
            dtos.add(toDistinctArticleDto(article));
        }
        return dtos;
    }
}
