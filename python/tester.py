import datetime
import pytz
import kollavarsham

now = pytz.utc.localize(datetime.datetime.utcnow())
kv = kollavarsham.Kollavarsham(latitude=10, longitude=76.2, system="SuryaSiddhanta")

today = kv.from_gregorian_date(date=now)
print(today.year, today.ml_masa_name, today.date, '(' + today.naksatra.ml_malayalam + ')')
