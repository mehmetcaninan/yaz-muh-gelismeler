from flask import Flask
from flask_restful import Api, Resource, reqparse

app= Flask(__name__)
api=Api(app)

class Toplama(Resource):
    def get(self,ilkSayi,ikinciSayi):
        toplam=ilkSayi+ikinciSayi
        return {
            'toplam':toplam
        }


api.add_resource(Toplama,'/toplama/<int:ilkSayi>/<int:ikinciSayi>')

if __name__ == '__main__':
    app.run()