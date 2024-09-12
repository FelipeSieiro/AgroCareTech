package br.com.fiap.plusoft.AgroCareTech.user.dto;


import br.com.fiap.plusoft.AgroCareTech.user.User;

public record UserProfileResponse(
        String name,
        String email,
        String avatar,
        String role,
        String phoneNumber
) {
    public UserProfileResponse(User user){
        this(user.getName(), user.getEmail(), user.getAvatar(), user.getRole(), user.getPhoneNumber());
    }
}