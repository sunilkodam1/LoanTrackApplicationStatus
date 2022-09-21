/**
 * 
 */
package com.abcbank.loantrack.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.abcbank.loantrack.entity.LoanTrackModel;

/**
 * @author kosunil
 *
 */

@Repository
public interface LoanTrackRepository extends JpaRepository<LoanTrackModel, Long> {

}
