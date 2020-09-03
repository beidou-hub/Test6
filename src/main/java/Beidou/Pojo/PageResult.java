package Beidou.Pojo;

import java.util.List;

public class PageResult<T> {
    private List<T> result;
    private Long total;

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public PageResult(List<T> result, Long total) {
        this.result = result;
        this.total = total;
    }
}
