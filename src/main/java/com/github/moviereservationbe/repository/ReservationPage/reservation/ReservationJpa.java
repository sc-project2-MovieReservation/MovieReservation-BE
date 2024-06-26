package com.github.moviereservationbe.repository.ReservationPage.reservation;

import com.github.moviereservationbe.repository.Auth.user.User;
import com.github.moviereservationbe.repository.MainPage.movie.Movie;
import org.checkerframework.checker.guieffect.qual.UI;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReservationJpa extends JpaRepository<Reservation, Integer> {

    @Query(
            "SELECT r " +
                    "FROM Reservation r " +
                    "WHERE r.reserveNum = :reserveNum"
    )
    Optional<Reservation> findByReserveNum(String reserveNum);

    @Query(
            "SELECT r " +
                    "FROM Reservation r " +
                    "JOIN r.user u " +
                    "WHERE u = :user"
    )
    List<Reservation> findByUser(User user);

    @Query(
            "SELECT r " +
                    "FROM Reservation r " +
                    "JOIN r.user u " +
                    "WHERE r.reserveNum= :reserveNum AND u= :user"
    )
    Optional<Reservation> findByReserveNumAndUser(String reserveNum, User user);

    @Query(
            "SELECT r " +
                    "FROM Reservation r " +
                    "JOIN r.user u " +
                    "JOIN r.schedule s " +
                    "JOIN s.movie m " +
                    "WHERE u= :user AND m= :movie "
    )
    Optional<Reservation> findByUserAndMovie(User user, Movie movie);
}
