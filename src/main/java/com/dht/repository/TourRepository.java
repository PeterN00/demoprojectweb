/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dht.repository;

import com.dht.pojo.Tourinformation;
import java.util.List;

/**
 *
 * @author huynh
 */
public interface TourRepository {
    List<Tourinformation> getTour(String kw);
}
