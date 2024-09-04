package org.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author huangqi
 * @Date 2024/9/3 23:36
 */
@Component
public class AA {


    @Autowired
    private BB bb;

    public BB getBb() {
        return bb;
    }

    public void setBb(BB bb) {
        this.bb = bb;
    }
}
