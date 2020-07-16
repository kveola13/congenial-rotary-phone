package com.kveola13.springmasterclass.sorting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Qualifier("bubbleSortAlgorithm")
    @Autowired
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(@Qualifier("bubbleSortAlgorithm") SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public SortAlgorithm getSortAlgorithm() {
        return sortAlgorithm;
    }

    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor) {
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        return 3;
    }

    @PostConstruct
    public void postConstruct() {
        LOGGER.info("post construct");
    }

    @PreDestroy
    public void preDestroy() {
        LOGGER.info("pre destroy");
    }

}
