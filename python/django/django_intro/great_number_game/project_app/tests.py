# from django.test import TestCase

# # def generator(request):
# #     return randint(1, 100)
# # def rand_guess():
# #     random_number = generator()
# #     print("this is random_number", random_number)
# #     guess_left = 3
# #     flag = 0
# #     while guess_left > 0:
# #         guess = int(input("Pick your number to "
# #         "enter the lucky draw\n"))
# #         if guess == random_number:
# #             flag = 1
# #         break
# #     else:
# #             print("Wrong Guess!!")
# #             guess_left -= 1
# #             if flag is 1:
# #                 return True
# #             else:
# #                 return False


# # if name == 'main':
# #     if rand_guess() is True:
# #         print("Congrats!! You Win.")
# #     else :
# #         print("Sorry, You Lost!")
#        flag = 1
#         break
#     else:
#             print("Wrong Guess!!")
#             guess_left -= 1
#             if flag is 1:
#                 return True
#             else:
#                 return False
#     return render(request, 'show.html')
# # if __name__ == '__main__':
# #     if index() is True:
# #         print("Congrats!! You Win.")
# #         request.session['result'] = "Congrats!! You Win."
# #     else: print("Sorry, You Lost!")
# #         request.session['result'] = "Sorry, You Lost!"




# def user_guess(request):
#     newnumber = int(request.POST['newnumber'])
#     print("user number", newnumber)
#     guess_left = 3
#     flag = 0
#     while guess_left > 0:
#         if newnumber == request.session.get('getRandom'):
#             flag = 1
#         break
#     else:
#             print("Wrong Guess!!")
#             guess_left -= 1
#             if flag is 1:
#                 return True
#             else:
#                 return False
#     return redirect('show/')

# def show(request):
#     if __name__ == '__main__':
#         if user_guess() is True:
#             print("Congrats!! You Win.")
#             request.session['result'] = "Congrats!! You Win."
#         else: print("Sorry, You Lost!")
#         request.session['result'] = "Sorry, You Lost!"
#     return render(request, "show.html")

# def play_again(request):
#     print(request.session['getRandom'])
#     return redirect ('/')
# def sucsess(request):
#     if __name__ == '__main__':
#         if user_guess() is True:
#             print("Congrats!! You Win.")
#             request.session['result'] = "Congrats!! You Win."
#     return redirect("/show")

# def try_again(request):
#     if user_guess() is False:
#         print("Sorry, You Lost!")
#         request.session['result'] = "Sorry, You Lost!"
#     return render(request, "show.html")
    # path('user_guess/', views.user_guess),
    # path('user_guess/show/', views.show),
    # path('user_guess/show/play_again/', views.play_again),
    # path('user_guess/show/', views.user_guess),